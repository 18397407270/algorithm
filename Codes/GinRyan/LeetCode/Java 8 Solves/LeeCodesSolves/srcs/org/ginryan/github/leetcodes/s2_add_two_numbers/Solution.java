package org.ginryan.github.leetcodes.s2_add_two_numbers;

import java.util.ArrayList;

/**
 * 
 * �������� �ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢 һλ ���֡�
 * 
 * ��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�
 * 
 * �����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��
 * 
 * ʾ����
 * 
 * ���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 
 * �����7 -> 0 -> 8
 * 
 * ԭ��342 + 465 = 807
 *
 * @author GinRyan
 */
class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode retListNode = new ListNode(0);
		ListNode latestRetListNode = retListNode;
		ListNode currentNode1 = l1;
		ListNode currentNode2 = l2;
		// ��λ����׼��ֵ
		int carry = 0;

		while (currentNode1 != null || currentNode2 != null) {
			// һ�����������սڵ㣬��˵����λΪ0��������λΪ0
			currentNode1 = currentNode1 == null ? new ListNode(0) : currentNode1;
			currentNode2 = currentNode2 == null ? new ListNode(0) : currentNode2;
			// �½�һ���ڵ㣬�������������֮�ͣ����Ҽ�����һ�ڵ��λֵ�����޽�λ���ֵΪ0
			int cSum = currentNode1.val + currentNode2.val + carry;
			// ȡ���������ֵ
			int cMod = cSum % 10;
			// ȡ����ֵ����λֵд�뵽to_upper_pos�����У������´ν���λֵ�Ӻ�
			carry = cSum / 10;

			ListNode createMode = new ListNode(cMod);
			//�ҽӵ��������ڵ���
			latestRetListNode.next = createMode;
			//�ҽӵ��������ڵ���֮��Ҫ��ǰ��latestRetListNode����һ���ڵ�
			latestRetListNode = latestRetListNode.next;
			//�μ��ڵ����
			currentNode1 = currentNode1.next;
			currentNode2 = currentNode2.next;

		}
		//���λ�����λ����Ҫ����һλ�ڵ㣬��1
		if (carry > 0) {
			ListNode createMode = new ListNode(carry);
			latestRetListNode.next = createMode;
		}
		return retListNode.next;
	}

	public static void main(String[] args) {

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}