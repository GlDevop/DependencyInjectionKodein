package gabriellee.project.dependencyinjectionkodein

import android.app.Application
import gabriellee.project.dependencyinjectionkodein.data.db.Database
import gabriellee.project.dependencyinjectionkodein.data.db.DatabaseFakeImpl
import gabriellee.project.dependencyinjectionkodein.data.db.QuoteDao
import gabriellee.project.dependencyinjectionkodein.data.repository.QuoteRepository
import gabriellee.project.dependencyinjectionkodein.data.repository.QuoteRepositoryImpl
import gabriellee.project.dependencyinjectionkodein.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuotesApplication : Application(), KodeinAware{
    override val kodein = Kodein.lazy {

        bind<Database>() with singleton { DatabaseFakeImpl()}
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao}
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        bind() from provider {QuotesViewModelFactory(instance()) }

    }
}