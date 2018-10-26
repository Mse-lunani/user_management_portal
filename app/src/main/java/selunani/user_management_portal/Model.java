package selunani.user_management_portal;

/**
 * Created by LENOVO V310 on 10/26/2018.
 */

public class Model {
    private String name, id ,thumbnailUrl;

    public Model() {
    }
    public Model(String name, String id, String thumbnailUrl) {
        this.name=name;
        this.id=id;
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id= id;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
