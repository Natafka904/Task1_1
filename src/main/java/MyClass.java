import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyClass {
    public static void main(String[] args) {
        Props p = new Props();
        String[] str1 = p.s1.split(" ");
        String[] str2 = p.s2.split(" ");
             for (int i=0; i<str1.length; i++) {
            int n = 0;
            for (int k = 0; k < str2.length; k++)
                if (str1[i].equalsIgnoreCase(str2[k])) n++;
                if (n==0) {
                    System.out.println(str1[i]);
                }
        }
        }
        }