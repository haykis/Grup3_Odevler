package zeynepTubaTur;


	import java.util.NavigableMap;
	import java.util.NavigableSet;
	import java.util.SortedMap;
	import java.util.TreeMap;

	public class H16 {

		public static void main(String[] args) {

//		 TreeMap classini kullanarak nesne uretiniz. 
//		 Asagidaki hazir metotlarin ne is yaptigini gosteriniz.
			
//		 1)ceilingEntry(key); 
//		 2) descendingKeySet();
//		 3) firstEntry(); 
//		 4) floorEntry(key); 
//		 5) headMap(key);
//		 6) headMap(key,true); 
//		 7) tailMap(key); 
//		 8) tailMap(key,false); 

			
//		    1)ceilingEntry(key); 	
//		    Kumede var olan bir key isteniyorsa onu yazdirir. 
//			Kumede var olmayan bir keyi istiyorsa, bu keyden bir sonraki gelen(bir buyugu olan) keyi yazdirir.
//			Hem kumede var olmayan key ise, hem de kendinden sonra gelen bir key de yok ise, null yazdirir.

			TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
	//	
			treemap.put(2, "two");
			treemap.put(7, "seven");
			treemap.put(3, "three");
//		  
			System.out.println("The next greater key-value of 5 is : " + treemap.ceilingEntry(5));

			System.out.println("The next greater key-value of 8 is : " + treemap.ceilingEntry(8));

			
			
//	      2)descendingKeySet();
//		    Keyleri azalan bir sırada yazdirir. Sadece keyleri yazdirir.

			treemap.put(3, "three");
			treemap.put(1, "one");
			treemap.put(2, "two");
			treemap.put(0, "zero");
			treemap.put(7, "seven");
			treemap.put(6, "six");

			NavigableSet set1 = treemap.descendingKeySet();

			System.out.println("Navigable set values are: " + set1);

			
			
//	      3)firstEntry():
//	      Kumedeki ilk keyi, key-value olarak yazdirir.

			treemap.put(2, "Java");
			treemap.put(4, "CPP");
			treemap.put(5, "PHP");
			treemap.put(1, "Python");
			treemap.put(3, "C");

			System.out.println("Lowest Entry is: " + treemap.firstEntry());

			
			
//	      4)floorEntry(key) :
//	      Varsa istenilen keyi, yoksa kendinden onceki keyi yazdirir.(key-value olarak)

			treemap.put(20, "Twenty");
			treemap.put(10, "Ten");
			treemap.put(13, "Thirteen");
			treemap.put(60, "Sixty");
			treemap.put(50, "Fifty");

			System.out.println("The greatest key-value less than 18 is : " + treemap.floorEntry(18));

			
			
//	      5)headMap(key) :
//	      Siralayip verilen key degeri haric, ondan daha kucuk olan map degerlerini alir.

//	      Creating an empty TreeMap
			TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

//	      Mapping string values to int keys
			tree_map.put(10, "Geeks");
			tree_map.put(15, "4");
			tree_map.put(20, "Geeks");
			tree_map.put(25, "Welcomes");
			tree_map.put(30, "You");

//	      Displaying the TreeMap
			System.out.println("Initial Tree is: " + tree_map);

//	      Creating the sorted map for map head
			SortedMap<Integer, String> map_head = new TreeMap<Integer, String>();
			map_head = tree_map.headMap(20);

//	      Getting the map head
			System.out.println("The headmap is: " + map_head);

			
			
//	      6)headMap(key,true):
//	      Siralayip verilen key degeri dahil, kendinden kucuk map degerleri ile birlikte alir.

			NavigableMap<Integer, String> treemapheadincl = new TreeMap<Integer, String>();

//	      populating tree map
			treemap.put(2, "two");
			treemap.put(1, "one");
			treemap.put(3, "three");
			treemap.put(6, "six");
			treemap.put(5, "five");

//	      getting head map inclusive 3
			treemapheadincl = treemap.headMap(3, true);

			System.out.println("Checking values of the map");
			System.out.println("Value is: " + treemapheadincl);

			
			
//	      7)tailMap(key): 
//	      Aldigi key de dahil olarak, aldigi keyden buyuk olan keylerle, sonuna kadar mapi yazdirir.

//	      Mapping string values to int keys
			tree_map.put(10, "Ali");
			tree_map.put(15, "Ayse");
			tree_map.put(20, "Ahmet");
			tree_map.put(25, "Asim");
			tree_map.put(30, "Aynur");

//	      Displaying the TreeMap
			System.out.println("The original map is: " + tree_map);

//	      Displaying the submap
			System.out.println("The tailMap is " + tree_map.tailMap(15));

			
			
//	       8)tailMap(key,false);        
//	       Verilen keyi haric tutarak, kendinden buyuk olan keyleri, sonuna kadar yazdirir.

//	       tailMap(key,true); 
//	       Verilen keyi de dahil ederek, kendinden buyuk olan keyleri, sonuna kadar yazdirir.

			TreeMap<Integer, String> listOfNames = new TreeMap<Integer, String>();
			listOfNames.put(3, "C");
			listOfNames.put(1, "A");
			listOfNames.put(2, "D");
			listOfNames.put(6, "B");
			listOfNames.put(8, "B");

			System.out.println("Map :" + listOfNames.tailMap(3, false));
			System.out.println("Map :" + listOfNames.tailMap(3, true));
		}
	}