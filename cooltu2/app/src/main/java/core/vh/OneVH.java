package core.vh;


public class OneVH extends com.codingtu.cooltu.lib4a.ui.adapter.viewholder.CoreAdapterVH {

    public android.widget.TextView tv;
    public android.widget.TextView tv1;
    public OneVH(android.view.ViewGroup parent) {
        super(com.codingtu.cooltu.R.layout.item_one, parent);
        tv = itemView.findViewById(com.codingtu.cooltu.R.id.tv);
        tv1 = itemView.findViewById(com.codingtu.cooltu.R.id.tv1);
    }
}
