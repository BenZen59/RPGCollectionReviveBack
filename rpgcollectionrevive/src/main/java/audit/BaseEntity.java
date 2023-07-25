package audit;
import java.util.Date;
import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name= "updated_at")
    private Date updatedAt;

    @PrePersist
    protected void onCreate(){
        createdAt = new Date();
        updatedAt = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        updatedAt = new Date();
    }
}