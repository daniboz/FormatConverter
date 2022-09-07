

import java.util.List;

public class DocumentationMod {

    private long id;
    private boolean hidden;
    private String title;
    private List<Formats> formats;
    Meta meta;

    public DocumentationMod() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Formats> getFormats() {
        return formats;
    }

    public void setFormats(List<Formats> formats) {
        this.formats = formats;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
