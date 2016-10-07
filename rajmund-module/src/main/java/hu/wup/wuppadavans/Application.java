package hu.wup.wuppadavans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a felhaszn�l�sz�mot!");
        int usernumber = sc.nextInt();
        for (long ID = 1; ID <= usernumber; ID++) {
            if (ID > 1) {
                System.out.println(ID + ". Felhaszn�l�");
            }
            User user = new User();
            System.out.println("Add meg a vezet�kneved!");
            user.setLastName(sc.next());
            System.out.println("Add meg a keresztneved!");
            user.setFirstName(sc.next());
            System.out.println("Add meg a nemed!");
            user.setGender(sc.next());
            System.out.println("�s add meg az �letkorod!");
            user.setAge(sc.nextInt());
            userList.add(user);
            System.out.println("");
        }
        //System.out.println(userList);
        userList.forEach(System.out::println);
    }
}

			
		/* ArrayList lista = new ArrayList();
			for(int ID = 1; ID <= usernumber; ID++) {
				if(ID>1) {
					System.out.println(ID+". Felhaszn�l�");
				}
				lista.add(ID);
				System.out.println("Add meg a vezet�kneved!");
				user.setLastName(sc.next());
				lista.add(user.getLastName());
				System.out.println("Add meg a keresztneved!");
				user.setFirstName(sc.next());
				lista.add(user.getLastName());
				System.out.println("Add meg a nemed!");
				user.setGender(sc.next());
				lista.add(user.getGender());
				System.out.println("�s add meg az �letkorod!");
				user.setAge(sc.nextInt());
				lista.add(user.getAge());
				System.out.println("");
				//System.out.print(ID+1 + ". Felhaszn�l�:\n");
			}
			System.out.println(lista); 
			
	}

} */
