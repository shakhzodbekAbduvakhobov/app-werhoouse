package uz.pdp.appwerhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appwerhousedemo.entity.AttachmentContent;

public interface  AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}
