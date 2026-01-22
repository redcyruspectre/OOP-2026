package Pratice1.week1;
class Clothe {
    public static void main(String[] args) {
        //First way, if you dont know the data firsthdand, just structure 

        String [] [] clothColors = new String[2][3];
        clothColors[0][0] = "red";
        clothColors[0][1] = "blue";
        clothColors[0][2] = "green";

        //sec
        clothColors[1][0] = "orange";
        clothColors[1][1] = "yellow";
        clothColors[1][2] = "violet";
 
        //Second way , if data is already know
        String[][] clothColors2 = {
            {"red, blue, green"},
            {"orange, yellow, violet"},
        };


        for (int r = 0;r < clothColors2.length; r++){
           // System.out.println(clothTypes[r]);
            for (int c = 0; c < clothColors2[r].length; c++) {
                System.out.printf( "%8s", clothColors2[r][c]);
            }
            System.out.println();
        }
    }
}
    

