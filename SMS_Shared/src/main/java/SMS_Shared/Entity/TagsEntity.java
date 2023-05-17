package SMS_Shared.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tags", schema = "sms_shared", catalog = "")
public class TagsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "tag_name", nullable = true, length = 255)
    private String tagName;
    @Basic
    @Column(name = "status", nullable = true, length = 255)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagsEntity that = (TagsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(tagName, that.tagName) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tagName, status);
    }
}
