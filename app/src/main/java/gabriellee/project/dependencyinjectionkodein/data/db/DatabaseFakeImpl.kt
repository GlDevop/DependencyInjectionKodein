package gabriellee.project.dependencyinjectionkodein.data.db

class DatabaseFakeImpl : Database {
    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()

}