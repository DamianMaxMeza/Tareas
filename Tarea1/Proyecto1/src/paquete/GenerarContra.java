/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;
import java.util.Random;
import java.security.SecureRandom;

/**
 *
 * @author maxhm
 */
public class GenerarContra {
    char[] sim = "^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    char[] min = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    char[] num = "0123456789".toCharArray();
    char[] all = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
     Random rand = new SecureRandom();
     
    public String getPassword(int length) {
        assert length >= 4;
        char[] password = new char[length];
        password[0] = min[rand.nextInt(min.length)];
        password[1] = may[rand.nextInt(may.length)];
        password[2] = num[rand.nextInt(num.length)];
        password[3] = sim[rand.nextInt(sim.length)];

        for (int i = 4; i < length; i++) {
            password[i] = all[rand.nextInt(all.length)];
        }
        for (int i = 0; i < password.length; i++) {
            int randomPosition = rand.nextInt(password.length);
            char temp = password[i];
            password[i] = password[randomPosition];
            password[randomPosition] = temp;
        }
        return new String(password);
    }
    public String Resultado() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getPassword(8));
        }
        return getPassword(8);
    }
}

