package ba.com.zira.praksa.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the hut_object database table.
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "hut_object")
@NamedQuery(name = "ObjectEntity.findAll", query = "SELECT o FROM ObjectEntity o")
public class ObjectEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "HUT_OBJECT_ID_GENERATOR", sequenceName = "HUT_OBJECT_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HUT_OBJECT_ID_GENERATOR")
    private Long id;

    private String aliases;

    private LocalDateTime created;

    @Column(name = "created_by")
    private String createdBy;

    private String information;

    private LocalDateTime modified;

    @Column(name = "modified_by")
    private String modifiedBy;

    private String name;

    // bi-directional many-to-one association to LinkMapEntity
    @OneToMany(mappedBy = "object")
    private List<LinkMapEntity> linkMaps;

}