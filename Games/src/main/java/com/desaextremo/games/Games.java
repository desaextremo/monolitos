package com.desaextremo.games;

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
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GAMES")
    @SequenceGenerator(sequenceName = "games_seq", allocationSize = 1, name = "SEQ_GAMES")
    private Long id;
    @Column(name = "DEVELOPER", nullable = false, length = 20)
    private String developer;
    @Column(name = "MINAGE", nullable = false)
    private Long minage;
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
     * @return the developer
     */
    public String getDeveloper() {
        return developer;
    }

    /**
     * @param developer the developer to set
     */
    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    /**
     * @return the minage
     */
    public Long getMinage() {
        return minage;
    }

    /**
     * @param minage the minage to set
     */
    public void setMinage(Long minage) {
        this.minage = minage;
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

    public Games() {
    }

    public Games(Long id, String developer, Long minage, Long categoryId, String name) {
        this.id = id;
        this.developer = developer;
        this.minage = minage;
        this.categoryId = categoryId;
        this.name = name;
    }

    
}
