package assignment1;

class Pattern {

    enum Orientation {Top, Bottom}


    public static void main(String args[]) {
     
        
        Pattern x = new Pattern();
        
        x.getPyramid(5, Orientation.Bottom);

        String result = "1)";
        result += "\n" + Pattern.getTriangle(4, Orientation.Top);
        result += "\n" + x.repeat(".", 9);
        result += "\n";
        result += "\n" + "2)";
        result += "\n" + x.repeat(".", 10);
        result += "\n" + Pattern.getTriangle(4, Orientation.Bottom);
        result += "\n";

        result += "\n" + "3)";
        result += "\n" + Pattern.getPyramid(4, Orientation.Top);
        result += "\n" + Pattern.repeat(".", 11);
        result += "\n";
        result += "\n" + "4)";
        result += "\n" + Pattern.repeat(".", 12);
        result += "\n" + Pattern.getPyramid(4, Orientation.Bottom);

             System.out.println(result);
    }


    private static String repeat(String text, int times) {
        String result = "";
        for(int i = 0; i < times; ++i) {
            result += text;
        }
        return result;
    }


    private static String getPyramid(int height, Orientation orientation) {

        String result = "";
        int offset = 1;


        for(int i = 0; i < height; ++i) {

            String level = "";
            int starCount = (i * 2) + 1;
            int starStart = offset + (height - i);
            
            for(int j = 0; j < starStart; ++j) {
                level += " ";
            }

            for(int j = 0; j < starCount; ++j) {
                level += "*";
            }

            switch(orientation) {
                case Top:
                    result += i == 0 ? level : "\n" + level;
                    break;
                case Bottom:
                    result = i == 0 ? level : level + "\n" + result;
                    break;
            }
        }


        return result;
    }

    private static String getTriangle(int base, Orientation orientation) {

        String result = "";

        for(int i = 0; i < base; ++i) {

            String level = "";
            for(int j = 0; j <= i; ++j) {
                level += "*";
            }

            switch(orientation) {
                case Top:
                    result += i == 0 ? level : "\n" + level;
                    break;
                case Bottom:
                    result = i == 0 ? level : level + "\n" + result;
                    break;
            }
        }


        return result;
    }
}