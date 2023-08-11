public class Data {
//    Instance variables amount, unit, and downloadSpeed
    private double dataAmount;
    private String dataType;
    private double downloadSpeed;
    private double downloadTime;

    public double getDataAmount() {
        return dataAmount;
    }

    public void setDataAmount(double dataAmount) {
        this.dataAmount = dataAmount;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public double getDownloadSpeed() {
        return downloadSpeed;
    }

    public void setDownloadSpeed(double downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    public void setDownloadTime(double downloadTime) {
        this.downloadTime = downloadTime;
    }

    //    Constructor
    public Data(double dataAmount, String dataType, double downloadSpeed) {
        this.dataAmount = dataAmount;
        this.dataType = dataType;
        this.downloadSpeed = downloadSpeed;
    }

//    Class methods
    public double convertToMegabytes() {
        if (dataType.equalsIgnoreCase("Bytes")) {
            dataAmount = dataAmount / (1024 * 1024);
        } else if (dataType.equalsIgnoreCase("Kilobytes")) {
            dataAmount = dataAmount / 1024;
        } else if (dataType.equalsIgnoreCase("Megabytes")) {
            dataAmount = dataAmount / 1;
        } else if (dataType.equalsIgnoreCase("Gigabytes")) {
            dataAmount = dataAmount * 1024;
        }
        return dataAmount;
    }

    public double calculateDownloadTime() {
        if (dataType.equalsIgnoreCase("Kilobytes")) {
            downloadTime = (dataAmount / 1024) / 12.5;
        } else if (dataType.equalsIgnoreCase("Megabytes")) {
            downloadTime = dataAmount / 25;
        }
        return downloadTime;
    }

    public String getFormattedDownloadTime() {
        double minutes = downloadTime / 60;
        double seconds = downloadTime;
        int formattedMinutes = (int)minutes;
        int formattedSeconds = (int)seconds;
        return formattedMinutes + " minutes " + formattedSeconds + " seconds";
    }

//    toString using Class methods
    public String toString() {

    }
}
