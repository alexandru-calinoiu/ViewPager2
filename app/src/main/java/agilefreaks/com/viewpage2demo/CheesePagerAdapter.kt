package agilefreaks.com.viewpage2demo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CheesePagerAdapter(private val cheeses: Array<String>): RecyclerView.Adapter<CheesePagerAdapter.CheeseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CheeseViewHolder =
        CheeseViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cheese_list_item, parent, false))

    override fun getItemCount(): Int = cheeses.size

    override fun onBindViewHolder(holder: CheeseViewHolder, position: Int) {
        holder.cheeseName.text = cheeses[position]
    }

    class CheeseViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val cheeseName: TextView = view.findViewById(R.id.cheese_name)
    }
}