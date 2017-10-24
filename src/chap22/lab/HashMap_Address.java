package chap22.lab;
import java.io.*;
import java.util.*;
// Hash_Map은 검색용으로 사용
public class HashMap_Address {
 HashMap<String, Address> hashMap = new HashMap<String, Address>();
 // 객체가 들어가도 됨
 Scanner input = null;
 public static void main(String[] args) {
  new HashMap_Address().go();
 }
 private void go() {
  input = new Scanner(System.in);
  hashMap = new HashMap<String, Address>();
  getAddress();
  //System.out.println(hashMap);
  System.out.println("이름으로 검색 하시오 : ");
  String key = input.next();
  System.out.println("주소 : " + hashMap.get(key).getAddr() + "\n전화번호 : " + hashMap.get(key).getCellphone());
 }
 private void getAddress() {
  try {
   File file = new File("address.txt");
   BufferedReader br = new BufferedReader(new FileReader(file));
   String line = null;
   while((line = br.readLine()) != null) {
    addAddress(line);
   }
  }catch(IOException ex) {
   System.out.println(ex.getMessage());
  }
 }
 private void addAddress(String line) {
  String[] tokens = line.split("/");
  Address address = new Address(tokens[0], tokens[1], tokens[2]);
  hashMap.put(address.getName(),address); 
  // haspMap은 put으로 데이터를 넣음
  // hashMap.put(키, 값)
  // System.out.println(address.toString());
  }
}
 