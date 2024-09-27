public class Direction {
    public static String getShortedPath(String path) {
        int x=0;
        int y=0;
        for(int i=0; i<path.length(); i++) {
            int dir = path.charAt(i);
            if(dir == 'N') {
                y++;
            }else if(dir == 'S') {
                y--;
            }else if(dir == 'W') {
                x--;
            }else {
                x++;
            }
        }
        double distance = Math.sqrt(x * x + y * y);
       
        return String.format("%.2f", distance);
    }
    public static void main(String[] args) {
        String path = "WNEENESENN";
        System.out.println(getShortedPath(path));
    }
}
