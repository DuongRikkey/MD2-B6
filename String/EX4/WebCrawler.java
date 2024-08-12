package String.EX4;

public class WebCrawler {
    public static String getHTMLContent(String url) {
        StringBuilder content = new StringBuilder();
        try {
            URL website = new URL(url);
            BufferedReader in = new BufferedReader(new InputStreamReader(website.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine).append("\n");
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void main(String[] args) {
        String url = "http://dantri.com.vn/the-gioi.htm";
        String htmlContent = getHTMLContent(url);
        System.out.println(htmlContent);
    }
}
