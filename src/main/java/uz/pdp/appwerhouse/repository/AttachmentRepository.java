package uz.pdp.appwerhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appwerhouse.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
