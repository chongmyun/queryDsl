package study.querydsl.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id","name"})
public class NonRef {

    @Id
    @Column(name="non_ref_id")
    private Long id;
    private String name;

    public NonRef(Long id,String name) {
        this.id = id;
        this.name = name;
    }

    public NonRef(String name) {
        this.name = name;
    }
}
