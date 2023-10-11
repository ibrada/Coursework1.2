public class Main {
    public static void main(String[] args) {

        int[] warranty = new int[100000];
        int technicalService = 20000;
        for (int i = technicalService; i <= warranty.length; i = i + technicalService) {
            if (i <= warranty.length - technicalService) {
                System.out.println("Вы проехали " + i + " км, необходимо заехать на ТО");
            } else {
                System.out.println("Гарантийное обслуживание закончилось");
            }
        }

        System.out.println("-----");

        {
            int weddingAnniversary = 60;
            int award = weddingAnniversary * 100000;
            if (weddingAnniversary == 5) {
                System.out.println("Поздравляем с деревянной свадьбой, на ваш счет зачилсено " + award + " рублей");
            } else if (weddingAnniversary == 15) {
                System.out.println("Поздравляем с хрустальной свадьбой, на ваш счет зачислено " + award + " рублей");
            } else if (weddingAnniversary == 25) {
                System.out.println("Поздравляем с серебрянной свадьбой, на ваш счет зачислено " + award + " рублей");
            } else if (weddingAnniversary == 60) {
                System.out.println("Поздравляем с бриллиантовой свадьбой, на ваш счет зачислено " + award + " рублей");
            } else {
                System.out.println("Поздравляем с годовщиной свадьбы");
            }
        }

        System.out.println("-----");

        {
            int weddingAnniversary = 1;
            int award = weddingAnniversary * 100000;
            switch (weddingAnniversary) {
                case 5:
                    System.out.println("Поздравляем с деревянной свадьбой, на ваш счет зачилсено " + award + " рублей");
                    break;
                case 15:
                    System.out.println("Поздравляем с хрустальной свадьбой, на ваш счет зачислено " + award + " рублей");
                    break;
                case 25:
                    System.out.println("Поздравляем с серебрянной свадьбой, на ваш счет зачислено " + award + " рублей");
                    break;
                case 60:
                    System.out.println("Поздравляем с бриллиантовой свадьбой, на ваш счет зачислено " + award + " рублей");
                    break;
                default:
                    System.out.println("Поздравляем с годовщиной свадьбы");
            }
        }

    }
}