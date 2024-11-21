package python_to_java;

import java.util.Scanner;

public class SmartPhoneMain {
	private SmartPhone smartphone;

    public SmartPhoneMain() {
        smartphone = new SmartPhone(); // Instantiate the SmartPhone object
    }

    public void printMenu() {
        System.out.println("\n연락처 관리프로그램");
        System.out.println("------------------------");
        System.out.println("1. 연락처 입력");
        System.out.println("2. 모든 연락처 출력");
        System.out.println("3. 연락처 검색");
        System.out.println("4. 연락처 삭제");
        System.out.println("5. 연락처 수정");
        System.out.println("6. 파일 저장");
        System.out.println("7. 파일 로드");
        System.out.println("8. 프로그램 종료");
        System.out.println("------------------------");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.print("원하는 작업을 선택하세요 (1-8): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": // Input data
                    Address addr = smartphone.inputAddrData();
                    smartphone.addAddr(addr);
                    break;
                case "2":
                    smartphone.printAllAddr();
                    break;
                case "3":
                    System.out.print("검색할 이름을 입력하세요: ");
                    String searchName = scanner.nextLine();
                    smartphone.searchAddr(searchName);
                    break;
                case "4":
                    System.out.print("삭제할 이름을 입력하세요: ");
                    String deleteName = scanner.nextLine();
                    smartphone.deleteAddr(deleteName);
                    break;
                case "5":
                    System.out.print("수정할 이름을 입력하세요: ");
                    String editName = scanner.nextLine();
                    System.out.println("새로운 연락처 정보를 입력하세요.");
                    Address newAddr = smartphone.inputAddrData();
                    smartphone.editAddr(editName, newAddr);
                    break;
                case "6":
                    smartphone.fileSave();
                    break;
                case "7":
                    smartphone.fileLoad();
                    break;
                case "8":
                    System.out.println("프로그램을 종료합니다.");
                    return; // Exit the loop and terminate the program
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }

    public static void main(String[] args) {
        SmartPhoneMain smartphoneMain = new SmartPhoneMain();
        smartphoneMain.start();
    }
}
