package uz.pdp.appwerhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appwerhousedemo.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
