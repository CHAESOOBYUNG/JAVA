package python_to_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartPhone {
	private List<Address> contacts;
	
	public SmartPhone() {
		this.contacts = new ArrayList<>();
	}
	
	public Address inputAddrData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = scan.nextLine();
		System.out.println("전화번호를 입력하세요: ");
		String phone = scan.nextLine();
		System.out.println("이메일을 입력하세요: ");
		String email = scan.nextLine();
		System.out.println("주소를 입력하세요: ");
		String address = scan.nextLine();
		System.out.println("그룹(친구/가족)을 입력하세요: ");
		String group = scan.nextLine();
		
		return new Address(name, phone, email, address, group);
	}
	
	public void addAddr(Address addr) {
		if (contacts.size() < 10) {
			contacts.add(addr);
			System.out.println(">> 데이터가 저장되었습니다.");
		} else {
			System.out.println("연락처 공간이 가득찼습니다.");
		}
	}
	
	public void printAllAddr() {
		if (contacts.isEmpty()) {
			System.out.println("저장된 연락처가 없습니다.");
		} else {
			for (int i = 0; i < contacts.size(); i++) {
				System.out.println("\n[" + (i + 1) + "]");
				contacts.get(i).printInfo();
			}
		}
	}
	
	public void searchAddr(String name) {
		for(Address addr : contacts) {
			if (addr.getName().equals(name)) {
				addr.printInfo();
				return;
			}
		}
		System.out.println(name + "의 연락처를 찾을 수 없습니다.");
	}
	
	public void deleteAddr(String name) {
		for(Address addr : contacts) {
			if (addr.getName().equals(name)) {
				contacts.remove(addr);
				System.out.println(name + "의 연락처를 찾을 수 없습니다.");
				return;
			}
		}
		System.out.println(name + "의 연락처를 찾을 수 없습니다.");
	}
	
	public void editAddr(String name, Address newAddr) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                contacts.set(i, newAddr);
                System.out.println(name + "의 연락처가 수정되었습니다.");
                return;
            }
        }
        System.out.println(name + "의 연락처를 찾을 수 없습니다.");
    }

    public void fileSave() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contacts_db.txt", false))) {
            for (Address addr : contacts) {
                writer.write(addr.getName() + "\n");
                writer.write(addr.getPhone() + "\n");
                writer.write(addr.getEmail() + "\n");
                writer.write(addr.getAddress() + "\n");
                writer.write(addr.getGroup() + "\n");
            }
            System.out.println("파일이 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileLoad() {
        try (BufferedReader reader = new BufferedReader(new FileReader("contacts_db.txt"))) {
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            int num = lines.size() / 5;
            for (int i = 0; i < num; i++) {
                String name = lines.get(5 * i);
                String phone = lines.get(5 * i + 1);
                String email = lines.get(5 * i + 2);
                String address = lines.get(5 * i + 3);
                String group = lines.get(5 * i + 4);
                Address contact = new Address(name, phone, email, address, group);
                contacts.add(contact);
            }
            System.out.println("파일이 로드되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
