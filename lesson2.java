public class lesson2 {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        Character[][] array =new Character[4][4];
        array[0][0]='5';
        array[0][1]='2';
        array[0][2]='4';
        array[0][3]='8';

        array[1][0]='3';
        array[1][1]='4';
        array[1][2]='5';
        array[1][3]='6';

        array[2][0]='w';
        array[2][1]='4';
        array[2][2]='5';
        array[2][3]='6';

        array[3][0]='2';
        array[3][1]='9';
        array[3][2]='2';
        array[3][3]='a';


           vika(array);
    }

    public static void vika(Character[][] exc) throws MyArraySizeException, MyArrayDataException {

        int int_num;


        if (exc.length != 4) {
            throw new MyArraySizeException();
        }

        
        for (int loop= 0; loop <exc.length; loop++){
            for (int loop2 = 0 ; loop2 <exc.length; loop2 ++){

                int_num = Character.getNumericValue(exc[loop][loop2]); // converting

                System.out.println("int_num : "+ int_num);

            if (int_num <0 || int_num >9){

                System.out.println(" Не правильная  ячейка : x - " + loop + " y - " +loop2 );
                throw new MyArrayDataException();

                }
            }
        }
    }
}
