public class ClassMap {
    String [] [] deskArray;
    String name;

    public void setClassMap() {
        deskArray = new String[3][4];
    }
    public void setDesk() {
        boolean flag = false;
        for (int row=0; row<3; row++) {
            for (int col=0; col<4; col++) {
                if (deskArray[row] [col] == null) {
                    deskArray [row] [col] = name;
                    System.out.println(name + " desk is at position: Row:" + row + "Column:" + col);
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
        if (flag == false) {
            System.out.println("Todas las mesas están ocupadas.");
        }
    }

    public void displayDesk() {
        for (int row=0; row<3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(" " + deskArray [row] [col] + " ");
            }
            System.out.println();
        }
    }

    public void searchDesk() {
        boolean flag = false;
        for (int row=0; row<3; row++) {
            for (int col=0; col<4; col++) {
                if (deskArray[row] [col] == null) {
                    deskArray [row] [col] = name;
                    System.out.println(name);
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
        if (flag == false) {
            System.out.println("Todas las mesas están ocupadas.");
        }
    }
}