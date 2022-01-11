package hasidim.partyMaker.jpa;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@ToString
@Table(name = "hasidim_role")
public class HasidimRole {
    @Id
    private Integer id;
    private String roleName;
    private String shortName;
    private String cantDupWith;
}
