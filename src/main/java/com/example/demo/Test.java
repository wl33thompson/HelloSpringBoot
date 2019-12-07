package com.example.demo;

public class Test {
    public static void main(String[] args) {
        LinkNode linkNode1 = new LinkNode(1);
        LinkNode linkNode2 = new LinkNode(2);
        LinkNode linkNode3 = new LinkNode(3);
        linkNode1.next = linkNode2;
        linkNode2.next = linkNode3;

        revertLinkNode(linkNode1);

        while (linkNode1 != null) {
            System.out.println(linkNode1.value);
            linkNode1.next = linkNode1;
        }

    }

    public static void revertLinkNode(LinkNode node) {
        LinkNode lh1 = node;
        LinkNode p1 = node;

        LinkNode lh2 = null;
        LinkNode p2 = null;

        while (lh1 != null) {
            p1 = lh1;
            lh1 = p1.next;
            p1.next = null;

            //1 2 3
            //1 --> 2 1 ---> 3 2 1


            if (lh2 == null) {
                lh2 = p1;
            } else {
                p1.next = lh2;
                lh2 = p1;
            }
        }

        node = lh2;
    }


    static class LinkNode {
        int value;
        LinkNode next = null;

        LinkNode(int value) {
            this.value = value;
        }
    }
}
