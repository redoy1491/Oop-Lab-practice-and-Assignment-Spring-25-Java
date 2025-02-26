package Composition2;

class LibrarySystem {
    private Member member;

    LibrarySystem(Member member) {
        this.member = member;
    }

    void showMember() {
        System.out.println("Library Member Name : " + member.name);
    }
}

