package Stack_Using_DoublyLinked_List;

public class DoublyLinkedList {

	public Node start;
	public Node end;
	int size;

	/**
	 * @param start
	 * @param end
	 */
	public DoublyLinkedList() {

		this.start = null;
		this.end = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return start == null && end == null;
	}

//	public void insertAt(int ele, int pos) {
//
//		Node newNode = new Node(ele);
//
//		// ❗ Invalid position → insert at end + notify
//		if (pos < 1 || pos > size + 1) {
//			System.out.println("Invalid position, inserting at end");
//
//			if (isEmpty()) {
//				start = end = newNode;
//			} else {
//				end.setNext(newNode);
//				newNode.setPrev(end);
//				end = newNode;
//			}
//			size++;
//			return;
//		}
//
//		// ✅ Empty list
//		if (isEmpty()) {
//			start = end = newNode;
//			size++;
//			return;
//		}
//
//		// ✅ Insert at beginning
//		if (pos == 1) {
//			newNode.setNext(start);
//			start.setPrev(newNode);
//			start = newNode;
//			size++;
//			return;
//		}
//
//		//Insert at end
//		if (pos == size + 1) {
//			end.setNext(newNode);
//			newNode.setPrev(end);
//			end = newNode;
//			size++;
//			return;
//		}
//
//		// OPTIMIZED PART (nearest traversal)
//		Node temp;
//		int itr;
//
//		// If position is nearer to start
//		if (pos <= size / 2) {
//			temp = start;
//			itr = 1;
//			while (itr < pos - 1) {
//				temp = temp.getNext();
//				itr++;
//			}
//		}
//
//		else {
//			temp = end;
//			itr = size;
//			while (itr >= pos) {
//				temp = temp.getPrev();
//				itr--;
//			}
//		}
//
//		// ✅ Middle insertion
//		newNode.setNext(temp.getNext());
//		newNode.setPrev(temp);
//
//		temp.getNext().setPrev(newNode);
//		temp.setNext(newNode);
//
//		size++;
//	}
//
//	public void insertAtBeginning(int ele) {
//		Node newNode = new Node(ele);
//		if (isEmpty()) {
//			start = end = newNode;
//
//		} else {
//			newNode.setNext(start);
//			start.setPrev(newNode);
//			start = newNode;
//
//		}
//		size++;
//
//	}
//
//	public void insertAtEnd(int ele) {
//		Node newNode = new Node(ele);
//		if (isEmpty()) {
//			start = end = newNode;
//
//		} else {
//			end.setNext(newNode);
//			newNode.setPrev(end);
//			end = newNode;
//		}
//		size++;
//	}
//
//	// Display list
//	void display() {
//		if (isEmpty()) {
//			System.out.println("List is empty");
//			return;
//		}
//		Node temp = start;
//		System.out.print("NULL <-> ");
//		while (temp != null) {
//			System.out.print(temp.data + " <-> ");
//			temp = temp.next;
//		}
//		System.out.println("NULL");
//	}
//
//	public void deleteFromBeginning() {
//		if (isEmpty()) {
//			System.out.println("List is Already Empty!....");
//			return;
//		}
//
//		if (start == end) {
//			start = end = null;
//		} else {
//
//			start = start.getNext();
//			start.setPrev(null);
//
//		}
//		size--;
//	}
//
//	public void deleteFromEnd() {
//
//		if (isEmpty()) {
//			System.out.println("List is Already Empty!....");
//			return;
//		}
//
//		if (start == end) {
//			start = end = null;
//		} else {
//			end = end.getPrev();
//			end.setNext(null);
//		}
//		size--;
//
//	}
//
//	public void deleteFromPosition(int pos) {
//
//		// ❌ Empty list
//		if (isEmpty()) {
//			System.out.println("List is Already Empty!....");
//			return;
//		}
//
//		// ❌ Invalid position → delete at end + notify
//		if (pos < 1 || pos > size) {
//			System.out.println("Invalid position, deleted at end");
//			deleteFromEnd();
//			return;
//		}
//
//		// ✅ Single node
//		if (start == end) {
//			start = end = null;
//			size--;
//			return;
//		}
//
//		// ✅ Delete from beginning
//		if (pos == 1) {
//			deleteFromBeginning();
//			return;
//		}
//
//		// ✅ Delete from end
//		if (pos == size) {
//			deleteFromEnd();
//			return;
//		}
//
//		// 🔥 OPTIMIZED nearest traversal
//		Node temp;
//
//		// 👉 Near start
//		if (pos <= size / 2) {
//			temp = start;
//			for (int i = 1; i < pos; i++) {
//				temp = temp.getNext();
//			}
//		}
//		// 👉 Near end
//		else {
//			temp = end;
//			for (int i = size; i > pos; i--) {
//				temp = temp.getPrev();
//			}
//		}
//
//		// ✅ Correct middle deletion
//		temp.getPrev().setNext(temp.getNext());
//		temp.getNext().setPrev(temp.getPrev());
//
//		size--;
//	}
//
//	public int getElement(int pos) {
//		
//	        // position valid range: 1 to size
//	        if (pos < 1 || pos > size) {
//	            throw new IndexOutOfBoundsException("Invalid position");
//	        }
//
//	        Node current;
//
//	        // Convert to 0-based index logic internally
//	        int index = pos - 1;
//
//	        // Optimized traversal
//	        if (index < size / 2) {
//	            // Forward traversal from head
//	            current = start;
//	            for (int i = 0; i < index; i++) {
//	                current = current.next;
//	            }
//	        } else {
//	            // Backward traversal from tail
//	            current = end;
//	            for (int i = size - 1; i > index; i--) {
//	                current = current.prev;
//	            }
//	        }
//
//	        return current.data;
//	    }
		
	}


