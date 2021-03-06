package net.paulgray.mocklti2.gradebook;

import javax.persistence.*;

/**
 * Created by paul on 10/24/16.
 */
@Entity
@Table(name = "gradebook_lineitems")
public class GradebookLineItem {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "gradebook_id")
    private Integer gradebookId;

    @Column(name = "resource_link_id")
    private String resourceLinkId;

    @Column(name = "title")
    private String title;

    @Column(name = "activity_id")
    private String activityId;

    public GradebookLineItem() {
    }

    public GradebookLineItem(Integer gradebookId, String resourceLinkId) {
        this.gradebookId = gradebookId;
        this.resourceLinkId = resourceLinkId;
        this.title = null;
        this.activityId = null;
    }

    public GradebookLineItem(Integer gradebookId, String resourceLinkId, String title, String activityId) {
        this.gradebookId = gradebookId;
        this.resourceLinkId = resourceLinkId;
        this.title = title;
        this.activityId = activityId;
    }

    public String getResourceLinkId() {
        return resourceLinkId;
    }

    public void setResourceLinkId(String resourceLinkId) {
        this.resourceLinkId = resourceLinkId;
    }

    public Integer getGradebookId() {
        return gradebookId;
    }

    public void setGradebookId(Integer gradebookId) {
        this.gradebookId = gradebookId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
}
