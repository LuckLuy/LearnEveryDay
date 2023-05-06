package list;

import org.apache.commons.collections.CollectionUtils;

import java.security.SecureRandom;
import java.util.*;

public class SortListSemo {
  public static void main(String[] args) {
    SecureRandom rd = new SecureRandom();
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<10;i++){
      list.add(rd.nextInt(100));
    }
    System.out.println(list);

    // ÅÅÐò
    Collections.sort(list);
    System.out.println(list);


  }
}
