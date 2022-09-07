

import java.util.List;


public class Fields {

    private Long id;
    Meta meta;
    private Long cerinta;
    private String code;
    private String title;
    private Long validationMode;
    private String description;
    private DocumentationMod documentationMod;
    private String applicationMod;

    public void setLoadDocument(List<LoadDocument> loadDocument) {
        this.loadDocument = loadDocument;
    }

    private List<LoadDocument> loadDocument;
    private boolean isApplicable;
    private boolean isImplemented;

    Fields() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Long getCerinta() {
        return cerinta;
    }

    public void setCerinta(Long cerinta) {
        this.cerinta = cerinta;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getValidationMode() {
        return validationMode;
    }

    public void setValidationMode(Long validationMode) {
        this.validationMode = validationMode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DocumentationMod getDocumentationMod() {
        return documentationMod;
    }

    public void setDocumentationMod(DocumentationMod documentationMod) {
        this.documentationMod = documentationMod;
    }

    public String getApplicationMod() {
        return applicationMod;
    }

    public void setApplicationMod(String applicationMod) {
        this.applicationMod = applicationMod;
    }


    public boolean isApplicable() {
        return isApplicable;
    }

    public void setApplicable(boolean applicable) {
        isApplicable = applicable;
    }

    public boolean isImplemented() {
        return isImplemented;
    }

    public void setImplemented(boolean implemented) {
        isImplemented = implemented;
    }

    @Override
    public String toString() {
        return id.toString();
    }
}
