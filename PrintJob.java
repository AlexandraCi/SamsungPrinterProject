package bean;

public class PrintJob {
	private String DriveId;
	private String fileName;
	private String printerAddress;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDriveId() {
		return DriveId;
	}
	public void setDriveId(String driveId) {
		DriveId = driveId;
	}
	public String getPrinterAddress() {
		return printerAddress;
	}
	public void setPrinterAddress(String printerAddress) {
		this.printerAddress = printerAddress;
	}

}
