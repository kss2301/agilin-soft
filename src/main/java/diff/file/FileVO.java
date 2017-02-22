package diff.file;

public class FileVO {

	private String fileName;
	private String relativeFilePath;	// ������ϰ��
	private String absFilePath;	// �������ϰ��
	private String relativePath;		// �����
	private String absPath;		// ������

	public FileVO() {
		
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getRelativeFilePath() {
		return relativeFilePath;
	}

	public void setRelativeFilePath(String relativeFilePath) {
		this.relativeFilePath = relativeFilePath;
	}

	public String getAbsFilePath() {
		return absFilePath;
	}

	public void setAbsFilePath(String absFilePath) {
		this.absFilePath = absFilePath;
	}

	public String getRelativePath() {
		return relativePath;
	}

	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}

	public String getAbsPath() {
		return absPath;
	}

	public void setAbsPath(String absPath) {
		this.absPath = absPath;
	}
	
	public String toString() {
		
		return "fileName:" + fileName + ", relativeFilePath:" + relativeFilePath + ", absFilePath:" + absFilePath + ", relativePath:" + relativePath + ", absPath:" + absPath;
	}
	
}
