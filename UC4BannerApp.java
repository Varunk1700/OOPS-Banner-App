public class UC4BannerApp {
    public static void main(String[] args) {

        // 1. Create String array
        String[] bannerLines = new String[7];

        // 2. Populate using String.join()
        bannerLines[0] = String.join(" ", " *** ", " *** ", "**** ", " *** ");
        bannerLines[1] = String.join(" ", "*   *", "*   *", "*   *", "*    ");
        bannerLines[2] = String.join(" ", "*   *", "*   *", "*   *", "*    ");
        bannerLines[3] = String.join(" ", "*   *", "*   *", "**** ", " *** ");
        bannerLines[4] = String.join(" ", "*   *", "*   *", "*    ", "    *");
        bannerLines[5] = String.join(" ", "*   *", "*   *", "*    ", "    *");
        bannerLines[6] = String.join(" ", " *** ", " *** ", "*    ", " *** ");

        // 3. Enhanced for-each loop to print
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}