package uz.pdp.appwerhouse.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.appwerhouse.entity.Attachment;
import uz.pdp.appwerhouse.entity.AttachmentContent;
import uz.pdp.appwerhouse.payload.Result;
import uz.pdp.appwerhouse.repository.AttachmentContentRepository;
import uz.pdp.appwerhouse.repository.AttachmentRepository;

import java.util.Iterator;

@Service
public class AttachmentService {

    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    @SneakyThrows
    public Result upload(MultipartHttpServletRequest request){
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        Attachment attachment = new Attachment();
        attachment.setName(file.getOriginalFilename());
        attachment.setSize(file.getSize());
        attachment.setContentType(file.getContentType());
        Attachment attachmentSaved = attachmentRepository.save(attachment);

        AttachmentContent attachmentContent = new AttachmentContent();
        attachmentContent.setBytes(file.getBytes());
        attachmentContent.setAttachment(attachmentSaved);
        attachmentContentRepository.save(attachmentContent);

        return new Result("Fayl saqlandi", true, attachmentSaved.getId());
    }
}
