package Interpreter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
/**
 * �����Ļ���
 *
 * @author
 *
 */
public class Context {
  // ���������ı�����
  private final StringTokenizer stringTokenizer;
  // ��ǰ����
  private String currentToken;
  // �����洢��̬�仯��Ϣ����
  private final Map<String, Object> map = new HashMap<String, Object>();
  /**
   * ���췽�����ý�������
   *
   * @param text
   */
  public Context(String text) {
    // ʹ�ÿո�ָ��������ı�����
    this.stringTokenizer = new StringTokenizer(text);
  }
  /**
   * �����ı�
   */
  public String next() {
    if (this.stringTokenizer.hasMoreTokens()) {
      currentToken = this.stringTokenizer.nextToken();
    } else {
      currentToken = null;
    }
    return currentToken;
  }
  /**
   * �ж������Ƿ���ȷ
   *
   * @param command
   * @return
   */
  public boolean equalsWithCommand(String command) {
    if (command == null || !command.equals(this.currentToken)) {
      return false;
    }
    return true;
  }
  /**
   * ��õ�ǰ��������
   *
   * @return
   */
  public String getCurrentToken() {
    return this.currentToken;
  }
  /**
   * ��ýڵ������
   *
   * @return
   */
  public String getTokenContent(String text) {
    String str = text;
    if (str != null) { // �滻map�еĶ�̬�仯���ݺ󷵻� Iterator<String>
      // �滻map�еĶ�̬�仯���ݺ󷵻�
      Iterator<String> iterator = this.map.keySet().iterator();
      while (iterator.hasNext()) {
        String key = iterator.next();
        Object obj = map.get(key);
        str = str.replaceAll(key, obj.toString());
      }
    }
    return str;
  }
  public void put(String key, Object value) {
    this.map.put(key, value);
  }
  public void clear(String key) {
    this.map.remove(key);
  }
}
