package com.desaextremo.Fincas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author desaextremo
 */
@Entity
public class Farm {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FARM")
    @SequenceGenerator(sequenceName = "farm_seq", allocationSize = 1, name = "SEQ_FARM")
    private Long id;
    @Column(name = "ADDRESS", nullable = false, length = 20)
    private String address;
    @Column(name = "EXENSION", nullable = false)
    private String exension;
    @Column(name = "CATEGORY_ID", nullable = false)
    private Long categoryId;
    @Column(name = "NAME", nullable = false, length = 400)
    private String name;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the exension
     */
    public String getExension() {
        return exension;
    }

    /**
     * @param exension the exension to set
     */
    public void setExension(String exension) {
        this.exension = exension;
    }

    /**
     * @return the categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Farm() {
    }

    public Farm(Long id, String address, String exension, Long categoryId, String name) {
        this.id = id;
        this.address = address;
        this.exension = exension;
        this.categoryId = categoryId;
        this.name = name;
    }
}
