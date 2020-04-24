package Compose;

public interface Company {

	void add(Company company);

    void remove(Company company);
    //展示树形结构
    void display(int depth);
    //不同部门所具有的各自的职责
    void duty();
}
