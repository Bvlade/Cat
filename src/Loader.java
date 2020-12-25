
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        Cat vasya = new Cat();
        Cat bantik = new Cat();

        System.out.println("Weight for murka: " + murka.getWeight());
        System.out.println("Weight for vasya: " + vasya.getWeight());
        System.out.println("Weight for bantik: " + bantik.getWeight());

        murka.feed(1.0);
        System.out.print("Murka is " + murka.getStatus());
        System.out.println(". Weight after feed: " + murka.getWeight());

        vasya.drink(2.0);
        System.out.print("Vasya is " + vasya.getStatus());
        System.out.println(". Weight after drink: " + vasya.getWeight());

        bantik.meow();
        System.out.print("Bantik is " + bantik.getStatus());
        System.out.println( ". Weight after Meow: " + bantik.getWeight());


        while (murka.getStatus()  ! )
            {
                System.out.print("Murka is " + murka.getStatus());
                murka.feed(1.0);

            }

    }
}