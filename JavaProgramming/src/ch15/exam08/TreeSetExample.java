package ch15.exam08;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//Set<Integer>set=new TreeSet<Integer>();//採乞拭惟 識情吉依幻 紫遂亜管馬陥. set interface 仙舛税 廃依戚陥. 陥莫失 仙舛税 吉依聖 紫遂拝 呪 赤陥.comparable
		TreeSet<Person>set=new TreeSet<Person>(new CompareByage());//Collections.reverseOrder() 笛惟 胡煽煽舌戚 吉陥.しせしせしせし
		//treeset 精 搾嘘研 背醤 脊径聖 廃陥.treeset 精 須採拭辞 搾嘘切研 薦因背操醤 廃陥. 搾嘘切研 層陥.
		//梓端拭 搾嘘奄管戚 蒸聖 凶 Comparator 戚 搾嘘奄管戚 酔識授是戚陥.
		set.add(new Person("畠掩疑",45));
		set.add(new Person("姶切郊",55));
		set.add(new Person("酵走据",31));

		
		for(Person p:set){//臣顕託授 切端亜吉陥. 搾嘘奄管戚 蒸澗 person聖 増嬢 隔生形壱 馬艦猿 拭君亜 貝陥.
			System.out.println(p.getName()+p.getAge());
		}
	}

}
/*
 *comparable 精 搾嘘奄管戚 赤澗 梓端  
 */
