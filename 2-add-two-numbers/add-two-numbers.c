/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 
struct ListNode* head;
void addvalue(int value){
    struct ListNode *sum,*temp;
    sum=(struct ListNode*)malloc(sizeof(struct ListNode));
    sum->val=value;
    if(head==NULL){
        sum->next=head;
        head=sum;
    }
    else{
        temp=head;
        while(temp->next!=NULL){
            temp=temp->next;
        }
        temp->next=sum;
        sum->next=NULL;
    }
}
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    head=NULL;
    int carry=0;
    while(l1&&l2){
        int value=l1->val+l2->val+carry;
        carry=value/10;
        addvalue(value%10);
        l1=l1->next;
        l2=l2->next;
    }
    while(l1){
        int value=l1->val+carry;
        carry=value/10;
        addvalue(value%10);
        l1=l1->next;
    }
    while(l2){
        int value=l2->val+carry;
        carry=value/10;
        addvalue(value%10);
        l2=l2->next;
    }
    if(carry>0){
        addvalue(carry);
    }
    return head;
}