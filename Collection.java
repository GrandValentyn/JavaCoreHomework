public class Collection {

   Number [] numbers;

    public Collection() {

    }

    public static void all_elements(){
       Number [] numbers = new Number[20];
       for (int i = 0; i < numbers.length ; i++) {
           System.out.println(numbers[i]);

       }
   }


    public Collection(Number[] numbers) {
        this.numbers = numbers;
    }

    public class oneclass implements Iterator{


        @Override
        public void hasNext() {
            all_elements();


        }

        @Override
        public void next() {

            for (int i = 0; i <numbers.length ; i++) {
                if (i % 2 == 0){
                    numbers[i] = 0;
                }

            }
            all_elements();
        }

    }
    public class twoclass implements Iterator{

        @Override
        public void hasNext() {
            for (int i = 0; i <numbers.length ; i++) {
                if(i % 2 == 0){

                    numbers[i] =  null;

                }

            }

        }

        @Override
        public void next() {

            all_elements();
        }
    }
    static class threclass implements Iterator{


       private Number[] numbers = new Number[20];
        @Override
        public void hasNext() {
            for (int i = 0; i <numbers.length ; i++) {
                if (i % 3 == 0){
                    if ( i % 2 != 0){
                        System.out.println(numbers[i]);
               }
                }
            }
        }

        @Override
        public void next() {

        }
    }
    class fourclass implements Iterator{

        @Override
        public void hasNext() {
            System.out.println(numbers);

        }

        @Override
        public void next() {
            for (int i = 0; i <numbers.length ; i++) {
                if (i % 2 == 0){
                    i -= 100;
                    System.out.println(numbers[i]);
                }
            }

        }
    }
    static class fiveclass implements Iterator{

        @Override
        public void hasNext() {
            Number[] numbers = new Number[20];
            for (int i = 0; i <numbers.length ; i++) {
                if (i % 2 != 0){
                    i += 1;
                    System.out.println(numbers[i]);
                }
            }

        }

        @Override
        public void next() {

        }
    }

}