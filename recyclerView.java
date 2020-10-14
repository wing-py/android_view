protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView listview=findViewById(R.id.listview);
        Button btn=findViewById(R.id.btn);
        EditText text=findViewById(R.id.text);
        listview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        MyAdapter adapter=new MyAdapter();
        listview.setAdapter(adapter); }

    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.VH>{
        List<String> adapterlist=new ArrayList<>();
        public void MyAdapter(ArrayList arrayList){adapterlist.addAll(arrayList);}
        public VH onCreateViewHolder(ViewGroup parent, int viewType) { TextView textView=new TextView(getBaseContext());VH vh =new VH(textView);return vh; }
        public void onBindViewHolder(VH vh,int position){TextView textView=(TextView)vh.itemView;    textView.setText(adapterlist.get(position));}
        public int getItemCount(){return adapterlist.size();}
        public void add(String str){adapterlist.add(str);}
        public void remove(int position){adapterlist.remove(position);}
        public class VH extends RecyclerView.ViewHolder{ public VH(View itemView) { super(itemView); }}

