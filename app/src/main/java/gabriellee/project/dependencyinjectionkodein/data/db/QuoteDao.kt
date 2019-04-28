package gabriellee.project.dependencyinjectionkodein.data.db

import androidx.lifecycle.LiveData
import gabriellee.project.dependencyinjectionkodein.data.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}