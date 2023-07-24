public class Main {
    public static void main(String[] args) {
        WebPageStack webPageStack = new WebPageStack();

        // Adding web pages to the stack
        webPageStack.addWebPage(new WebPage("https://www.example.com/page1", "2023-07-22 10:30:00"));
        webPageStack.addWebPage(new WebPage("https://www.example.com/page2", "2023-07-22 11:15:00"));
        webPageStack.addWebPage(new WebPage("https://www.example.com/page3", "2023-07-22 12:00:00"));

        // Printing the most recent web page without removing it
        WebPage mostRecentPage = webPageStack.peekMostRecentWebPage();
        if (mostRecentPage != null) {
            System.out.println("Most recent web page:");
            System.out.println("URL: " + mostRecentPage.url);
            System.out.println("Timestamp: " + mostRecentPage.timestamp);
        } else {
            System.out.println("The stack is empty.");
        }

        // Removing the most recent web page
        WebPage removedPage = webPageStack.removeMostRecentWebPage();
        if (removedPage != null) {
            System.out.println("Removed web page:");
            System.out.println("URL: " + removedPage.url);
            System.out.println("Timestamp: " + removedPage.timestamp);
        } else {
            System.out.println("The stack is empty.");
        }




        // Printing the most recent web page after removal

        mostRecentPage = webPageStack.peekMostRecentWebPage();
        if (mostRecentPage != null) {
            System.out.println("Most recent web page:");
            System.out.println("URL: " + mostRecentPage.url);
            System.out.println("Timestamp: " + mostRecentPage.timestamp);
        } else {
            System.out.println("The stack is empty.");
        }



        // Checking if the stack is empty
        System.out.println("Is stack empty? " + webPageStack.isEmpty());


    }
}
