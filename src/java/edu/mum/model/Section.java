/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.model;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Minh Nguyen
 */
@Entity
@Table(name="sections")
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public class Section implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="SECTION_ID")
    private Long id;

    @OneToOne
    private Application application;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Section)) {
            return false;
        }
        Section other = (Section) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.mum.model.Section[ id=" + id + " ]";
    }
    
}
