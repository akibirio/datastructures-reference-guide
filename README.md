# datastructures-reference-guide
	- My Reference Guide for the Various Data Structures and Algorithms .. 


## Data Structures:
	## 1) Linear Data Structure
		elements arranged in sequence one after the other
		not best choice when program complexity increases due to operational complexities
			examples:
				Array
				Stack - LIFO 
				Queue - FIFO
				Linked List -> data elements connected thru'a series of nodes. each node contains data item and address to the next node
	
	## 2. Non-Linear Data Structures
		Elements are not in any sequence. they are arranged in hierarchical manner where one element will be connected to one or more elements
		A) Graph-Based DS
			Each Node is called a vertex and each vertex is connected to other vertices through edges.
			examples:
				Spanning Tree & Minimum Spanning Tree
				Strongly Connected Components
				Adjacency Matrix
				Adjacency List
		
		B) Trees Ds
			A tree is also a collection of vertices and edges.However, in Tree DS, there can only be one edge between two vertices.
			examples:
				Binary Tree
				Binary Search Tree
				AVL Tree
				B- Tree
				B+ Tree
				Red-Black Tree
				
		C) Map DS
			Items stored in hash tables , and Key, Value Paires
				
		

## Primitive Data Types:
	byte,short, int,long,float,double,char, boolean

## Objects:
Strings
Arrays   --- immutable/once declared size cannot be changed
		


## Collections:
		## List     	===>>> interfaces					
	===================						
	ArrayList(Resizable array)				
	Vector									
		Stack class(LiFO)					
	LinkedList								
											
											
											
											
		
	
	## Set (Does Not allow duplicates)	===>>> interfaces
	===========		  				
	HashSet							
	EnumSet							
		LinkedHashSet				
	sub:interfaces--				
		- SortedSet Interface			
		- NavigableSet Interface																							
				TreeSet class (Sorted)

				
	
	## Queue     ===>>> interfaces
	====================
		PriorityQueue (returns elements in sorted order) (Head DS)
		sub:interfaces--
				- Deque
					LinkedList
					ArrayDeque (Stack DS) FIFO
			    - BlockingQueue Interface
					ArrayBlockingQueue
					LinkedBlockingQueue
	
	
	## Map   -- Interface 
	============= (Key, Value)
	provides functionality map data structure
	Cannot have duplicate keys
	- classes:
		HashMap
		EnumMap  -> map implementation for elements of an enum->enum elements are used as keys
		LinkedHashMap (hash table & doubly linked list)->extends HashMap class->slow performance
		WeakHashMap -> hash table ds
		
	- sub:nterfaces
		SortedMap  ->provides sorting of keys stored in a map
			TreeMap class
		NavigableMap -> provides features to navigate among the map entries
			TreeMap class
		ConcurrentMap -> Thread Safe Map,i.e multiple threads can access the map without affetcing the consitency of entries in map
			ConcurrentHashMap class
	
			
			
			