package uz.pdp.appwerhouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.appwerhouse.entity.Attachment;
import uz.pdp.appwerhouse.payload.Result;
import uz.pdp.appwerhouse.service.AttachmentService;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @PostMapping("/upload")
    public Result upload(MultipartHttpServletRequest request) {
        Result result = attachmentService.upload(request);
        return result;
    }
}
