/*���������� ������������ ������
  ������������ ��� ���������� �������� ��� ����������
  Full time - 2017-18
  ��������� ����������: ������ 5�� ���������

  ��������� �������
  MSTFT1702 */

public class Song //���������� ������ Song
{
	//���������� ��������� ���������� ������������
	private String title;
	private Singer singer;
	private String url;
	//������� ����������� ��� ������������� �����
	public Song(String title, Singer singer, String url)
	{
		this.title = title;
		this.singer = singer;
		this.url = url;
	}
	//������� getTitle
	public String getTitle()
	{
		System.out.println(this.toString());
		return title;
	}
	//������� setTitle
	public void setTitle(String title)
	{
		this.title = title;
	}
	//������� getSinger
	public Singer getSinger()
		{
			return singer;
	}
	//������� setSinger
	public void setSinger(Singer singer)
		{
			this.singer = singer;
	}
	//������� getUrl
	public String getUrl()
		{
			return url;
	}
	//������� setUrl
	public void setUrl(String url)
		{
			this.url = url;
	}
	//������� toString
	public String toString()
	{
		return "Title: "+title+" -  Listen here: "+url;
	}
} //����� ������ Song