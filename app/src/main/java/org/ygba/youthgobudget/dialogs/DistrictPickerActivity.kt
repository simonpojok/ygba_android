package org.ygba.youthgobudget.dialogs

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import org.ygba.youthgobudget.R
import org.ygba.youthgobudget.data.helpers.district.District

class DistrictPickerActivity : AppCompatActivity() {
    private lateinit var districtPickerViewModel: DistrictPickerViewModel;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_district_picker)

        districtPickerViewModel = ViewModelProviders.of(this).get(DistrictPickerViewModel::class.java)

        val districtRecyclerView: RecyclerView = findViewById(R.id.district_recycler_view);
        val districtAdapter: DistrictAdapter = DistrictAdapter(this);

    }

    class DistrictAdapter(val context: Context): RecyclerView.Adapter<DistrictAdapter.DistrictViewHolder>() {
        lateinit var districts: List<District>;

        class DistrictViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val textView: TextView = itemView.findViewById(R.id.district_name);
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DistrictViewHolder {
            val view = LayoutInflater.from(context).inflate(R.layout.item_district, parent, false);
            return DistrictViewHolder(view)
        }

        override fun getItemCount(): Int {
            return districts.size
        }

        override fun onBindViewHolder(holder: DistrictViewHolder, position: Int) {
            holder.textView.text = districts[position].name
        }

        fun loadDistricts(districtList: List<District>) {
            districts = districtList;
            notifyDataSetChanged()
        }
    }
}